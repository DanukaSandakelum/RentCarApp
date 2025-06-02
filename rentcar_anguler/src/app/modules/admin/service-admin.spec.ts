import { TestBed } from '@angular/core/testing';

import { ServiceAdmin } from './service-admin';

describe('ServiceAdmin', () => {
  let service: ServiceAdmin;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceAdmin);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
