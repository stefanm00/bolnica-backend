import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Odeljenje } from './odeljenje';

describe('Odeljenje', () => {
  let component: Odeljenje;
  let fixture: ComponentFixture<Odeljenje>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Odeljenje],
    }).compileComponents();

    fixture = TestBed.createComponent(Odeljenje);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
