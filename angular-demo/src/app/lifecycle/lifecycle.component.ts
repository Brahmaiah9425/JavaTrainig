import {
  Component,
  OnChanges,
  OnInit,
  DoCheck,
  AfterContentInit,
  AfterContentChecked,
  AfterViewInit,
  AfterViewChecked,
  OnDestroy,
  SimpleChanges
} from '@angular/core';

@Component({
  selector: 'app-lifecycle',
  standalone: true, 
  templateUrl: './lifecycle.component.html',
  styleUrls: ['./lifecycle.component.css']
})
export class LifecycleComponent
  implements
    OnChanges,
    OnInit,
    DoCheck,
    AfterContentInit,
    AfterContentChecked,
    AfterViewInit,
    AfterViewChecked,
    OnDestroy {

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ngOnChanges: Change detection triggered', changes);
  }

  ngOnInit(): void {
    console.log('ngOnInit: Component initialization');
  }

  ngDoCheck(): void {
    console.log('ngDoCheck: Custom change detection');
  }

  ngAfterContentInit(): void {
    console.log('ngAfterContentInit: Content initialization');
  }

  ngAfterContentChecked(): void {
    console.log('ngAfterContentChecked: Checking changes in content');
  }

  ngAfterViewInit(): void {
    console.log('ngAfterViewInit: View initialization');
  }

  ngAfterViewChecked(): void {
    console.log('ngAfterViewChecked: Checking changes in view');
  }

  ngOnDestroy(): void {
    console.log('ngOnDestroy: Component destruction');
  }
}
