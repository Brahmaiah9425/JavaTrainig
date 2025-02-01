/*import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; 

import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';  
import { AboutusComponent } from './aboutus/aboutus.component';  

@NgModule({
  declarations: [
    AppComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    WelcomeComponent,  
    AboutusComponent    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }*/

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { LifecycleComponent } from './lifecycle/lifecycle.component';

@NgModule({
  declarations: [
    AppComponent,
    //LifecycleComponent 
  ],
  imports: [BrowserModule,LifecycleComponent],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}

