import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { FormDemoComponent } from './form-demo/form-demo.component'; 

@NgModule({
  declarations: [
    AppComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    FormDemoComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
