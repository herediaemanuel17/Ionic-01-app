import { Component, OnInit } from '@angular/core';
import { ActionSheetController } from '@ionic/angular';

@Component({
  selector: 'app-action-sheet',
  templateUrl: './action-sheet.page.html',
  styleUrls: ['./action-sheet.page.scss'],
})
export class ActionSheetPage implements OnInit {

  constructor( private actionSheetCtrl: ActionSheetController ) { } //aca se puede ver como se inyecto el actionsheetctrl
  ngOnInit() {
  }

  onClick() {
    this.presentActionSheet(); //llamo el metodo al hacer clicl
  }
  async presentActionSheet() {
    const actionSheet = await this.actionSheetCtrl.create({      //el actionSheetController hay que inyectarlo en el constructor
      header: 'Albumes',
      backdropDismiss:false, // con esto indico que no se pueda cerar al hacer clic afuera
      cssClass: 'my-custom-class',
      buttons: [{
        text: 'Delete',
        role: 'destructive',
        icon: 'trash-outline',
        cssClass: ' rojo ', //se agrega una clase para el estilo
        handler: () => {
          console.log('Delete clicked');
        }
      }, {
        text: 'Share',
        icon: 'share-outline',
        handler: () => {
          console.log('Share clicked');
        }
      }, {
        text: 'Play (open modal)',
        icon: 'caret-forward-circle-outline',
        handler: () => {
          console.log('Play clicked');
        }
      }, {
        text: 'Favorite',
        icon: 'heart-outline',
        handler: () => {
          console.log('Favorite clicked');
        }
      }, {
        text: 'Cancel',
        icon: 'close-outline',
        role: 'cancel',
        handler: () => {
          console.log('Cancel clicked');
        }
      }]
    });
    await actionSheet.present();
  } //se copip tal cual la pagina oficial

}
