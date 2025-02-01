import { TestBed } from '@angular/core/testing';
import { CanActivateChildFn } from '@angular/router';

import { admin1Guard } from './admin1.guard';

describe('admin1Guard', () => {
  const executeGuard: CanActivateChildFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => admin1Guard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
