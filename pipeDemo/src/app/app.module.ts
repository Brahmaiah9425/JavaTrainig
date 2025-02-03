/*import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { PipeComponent } from './pipe/pipe.component';
import { BrahmaiahPipe } from './brahmaiah.pipe';
import { ReversePipe } from './reverse.pipe';
import { PowerPipe } from './power.pipe';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    BrahmaiahPipe,
    ReversePipe,
    PowerPipe,
    PipeDemoComponent,
    
  ],
  imports: [
    BrowserModule,
    PipeComponent  // Import PipeComponent here
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }*/
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { ReversePipe } from './reverse.pipe';
import { PowerPipe } from './power.pipe';

@NgModule({
  declarations: [
    AppComponent,
    PipeDemoComponent,
    ReversePipe,  // Register ReversePipe
    PowerPipe,    // Register PowerPipe
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent], // Bootstraps the AppComponent
})
export class AppModule {}

