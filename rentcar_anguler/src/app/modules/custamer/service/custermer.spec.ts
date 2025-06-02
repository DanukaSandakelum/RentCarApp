import { TestBed } from '@angular/core/testing';

import { Custermer } from './custermer';

describe('Custermer', () => {
  let service: Custermer;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Custermer);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
