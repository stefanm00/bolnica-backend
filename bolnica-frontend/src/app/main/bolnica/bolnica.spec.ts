import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Bolnica } from './bolnica';

describe('Bolnica', () => {
  let component: Bolnica;
  let fixture: ComponentFixture<Bolnica>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Bolnica],
    }).compileComponents();

    fixture = TestBed.createComponent(Bolnica);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
