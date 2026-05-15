import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Pacijent } from './pacijent';

describe('Pacijent', () => {
  let component: Pacijent;
  let fixture: ComponentFixture<Pacijent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Pacijent],
    }).compileComponents();

    fixture = TestBed.createComponent(Pacijent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
