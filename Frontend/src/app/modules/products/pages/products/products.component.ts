import { Component } from '@angular/core';
import { BakeryCarrouselComponent } from '../../../../components/bakery-carrousel/bakery-carrousel.component';


@Component({
  selector: 'app-products',
  imports: [BakeryCarrouselComponent],
  templateUrl: './products.component.html',
  styleUrl: './products.component.scss'
})
export class ProductsComponent{

}
