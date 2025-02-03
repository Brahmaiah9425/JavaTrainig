import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { StylePipe } from './style-pipe.pipe'; // Import the pipe

@NgModule({
  declarations: [
    AppComponent,
    ParentComponent,
    ChildComponent,
    StylePipe  // Declare the pipe
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
