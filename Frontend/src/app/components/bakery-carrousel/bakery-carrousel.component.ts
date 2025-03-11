import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-bakery-carrousel',
  imports: [CommonModule],
  templateUrl: './bakery-carrousel.component.html',
  styleUrls: ['./bakery-carrousel.component.scss']
})
export class BakeryCarrouselComponent implements OnInit {
  // Arreglo de productos
  products = [
    { name: 'Pan de Avena', price: 2.50, image: 'img/logo_bg.png' },
    { name: 'Croissant', price: 1.80, image: 'img/contacto.png' },
    { name: 'Baguette', price: 2.00, image: 'img/contacto.png' },
    { name: 'Pan de Chocolate', price: 3.00, image: 'img/contacto.png' },
    { name: 'Galletas', price: 1.50, image: 'img/contacto.png' }
  ];

  currentIndex = 0;
  visibleProducts: any[] = [];

  constructor() { }

  ngOnInit(): void {
    this.updateVisibleProducts();
  }

  // Función para cambiar la vista de los productos
  changeSlide(direction: number): void {
    this.currentIndex = (this.currentIndex + direction + this.products.length) % this.products.length;
    this.updateVisibleProducts();
  }

  // Actualiza los productos visibles en el carrusel
  updateVisibleProducts(): void {
    this.visibleProducts = [];
    for (let i = 0; i < this.products.length; i++) {
      const index = (this.currentIndex + i) % this.products.length;
      this.visibleProducts.push(this.products[index]);
    }
  }
}
