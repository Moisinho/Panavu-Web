import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PastryCarrouselComponent } from './pastry-carrousel.component';

describe('PastryCarrouselComponent', () => {
  let component: PastryCarrouselComponent;
  let fixture: ComponentFixture<PastryCarrouselComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PastryCarrouselComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PastryCarrouselComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
