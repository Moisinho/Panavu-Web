import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BakeryCarrouselComponent } from './bakery-carrousel.component';

describe('BakeryCarrouselComponent', () => {
  let component: BakeryCarrouselComponent;
  let fixture: ComponentFixture<BakeryCarrouselComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BakeryCarrouselComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BakeryCarrouselComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
