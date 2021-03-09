import { Component, Input, OnInit, Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  @Input() mensaje;
  @Output() clickPost = new EventEmitter<number>(); //ese number dice que lo que emita sera un number en Ts se conoce como generico


  constructor() { }

  ngOnInit(): void {
  }

  onClick() { //listener creado por nosotros
    //console.log( this.mensaje.id ); cambio para enviar el evento al padre
    this.clickPost.emit( this.mensaje.id ); //lo que esta entre parentesis es lo que recibe el padre en su evento. mas alla de que nosotros declaramos que enviabamos un num
  }

}
