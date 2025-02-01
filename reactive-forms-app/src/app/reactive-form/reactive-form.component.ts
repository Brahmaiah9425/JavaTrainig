import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent {
 
  loginForm = new FormGroup({
    username: new FormControl('', [
      Validators.required,
      Validators.pattern("[A-Z]+"),
      Validators.maxLength(8)
    ]),
    password: new FormControl('', [
      Validators.required,
      Validators.minLength(5)
    ])
  });

 
  userLogin() {
    console.log("User login called: Hello, " + this.loginForm.value.username);
  }

 
  get username() {
    return this.loginForm.get('username');
  }

  get password() {
    return this.loginForm.get('password');
  }
}
