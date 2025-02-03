import { Component, OnInit } from '@angular/core';
import { MyServiceService } from './my-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  products: any[] = []; 
  searchQuery: string = '';  

  constructor(private myService: MyServiceService) {}

  ngOnInit(): void {
    this.myService.getProductDetails().subscribe((data) => {
      this.products = data;  
    });
  }

  searchProduct(): void {
    if (this.searchQuery) {
      this.products = this.products.filter(product =>
        product.title.toLowerCase().includes(this.searchQuery.toLowerCase())
      );
    } else {
      this.myService.getProductDetails().subscribe((data) => {
        this.products = data;  
      });
    }
  }
}
