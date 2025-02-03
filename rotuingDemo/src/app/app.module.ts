import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component'; // Home component
import { AboutUsComponent } from './about-us/about-us.component'; // AboutUs component
import { ContactUsComponent } from './contact-us/contact-us.component'; // ContactUs component

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
   
    ContactUsComponent, // Declare the ContactUs component here
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AboutUsComponent,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
