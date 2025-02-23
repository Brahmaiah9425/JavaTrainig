import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component'; 
import { AboutUsComponent } from './about-us/about-us.component'; 
import { ContactUsComponent } from './contact-us/contact-us.component'; 
import { authGuard } from './auth.guard'; 

const routes: Routes = [
  { path: '', component: HomeComponent },
  { 
    path: 'about-us', 
    loadComponent: () => import('./about-us/about-us.component').then(m => m.AboutUsComponent), 
    canActivate: [authGuard]
  },
  { 
    path: 'contact-us', 
    component: ContactUsComponent, 
    
  },
  { path: '**', redirectTo: '' } 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
