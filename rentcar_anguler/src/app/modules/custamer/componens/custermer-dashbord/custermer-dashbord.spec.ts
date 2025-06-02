import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustermerDashbord } from './custermer-dashbord';

describe('CustermerDashbord', () => {
  let component: CustermerDashbord;
  let fixture: ComponentFixture<CustermerDashbord>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustermerDashbord]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustermerDashbord);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
