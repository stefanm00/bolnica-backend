import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dijagnoza } from './dijagnoza';

describe('Dijagnoza', () => {
  let component: Dijagnoza;
  let fixture: ComponentFixture<Dijagnoza>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Dijagnoza],
    }).compileComponents();

    fixture = TestBed.createComponent(Dijagnoza);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
