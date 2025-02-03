import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { DataService } from './shared/data.service';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent
  ],
  imports: [
    BrowserModule,
  ],
  providers: [DataService], // Ensure the service is provided
  bootstrap: [AppComponent],
})
export class AppModule {}
