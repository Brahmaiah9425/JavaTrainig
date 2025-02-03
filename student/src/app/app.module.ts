import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsernameComponent } from './username/username.component';
import { AchievementsComponent } from './achievements/achievements.component';
import { StudentsComponent } from './students/students.component';
import { EmailComponent } from './email/email.component';
import { FormsModule } from '@angular/forms';
import { DataService } from './shared/data.service'; 


@NgModule({
  declarations: [
    AppComponent,
    UsernameComponent,
    AchievementsComponent,
    StudentsComponent,
    EmailComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
