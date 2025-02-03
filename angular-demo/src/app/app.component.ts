 import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string = 'angular data binding';
  isLoggedIn: boolean = false;
  imageUrl: string = "assets/flower.jpg";
  username: string = "";
  password: string = "";  
  isButtonClicked: boolean = true;
  msg: string = "before button click";

  showMessage() {
    this.msg = "you clicked me";
    this.isButtonClicked = true;
  }
}
