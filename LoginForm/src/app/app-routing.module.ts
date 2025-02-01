import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { AuthGuard } from './auth.guard';
import { Admin1Guard } from './admin1.guard';
import { DeleteComponent } from './delete/delete.component';
import { AddComponent } from './add/add.component';

const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { 
    path: 'admin', 
    component: AdminComponent, 
    canActivate: [AuthGuard], 
    data: { role: 'admin' }, 
    canActivateChild: [Admin1Guard], 
    children: [
      { path: 'add', component: AddComponent },
      { path: 'delete', component: DeleteComponent }
    ] 
  },
  { path: 'user', component: UserComponent, canActivate: [AuthGuard], data: { role: 'user' } },
  { path: '**', redirectTo: 'login' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
