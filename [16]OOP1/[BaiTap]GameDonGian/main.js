/**
 * Created by nhatnk on 4/26/17.
 */

function Hero(image, top, left, size,speed){
  this.image = image;
  this.top = top;
  this.left = left;
  this.size = size;
  this.speed = speed

  this.getHeroElement = function(){
    return '<img width="'+ this.size + '"' +
      ' height="'+ this.size + '"' +
      ' src="' + this.image +'"' +
      ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
  }
  this.moveRight = function(){
    this.left += Math.random()*this.size;
    this.top+= Math.random()*this.size;
    console.log('ok: ' +this.left);
  }
  this.moveTopRight = function(){
    this.left += Math.random()*this.size;
    this.top-= Math.random()*this.size;
    console.log('ok: ' +this.left);
  }
}

var hero = new Hero('pikachu.png', 20, 30, 200);

function start(){
  var body = document.body,
    html = document.documentElement;

var height = Math.max( body.scrollHeight, body.offsetHeight, 
                       html.clientHeight, html.scrollHeight, html.offsetHeight );
                                   var width = screen.width
  if(hero.left < window.innerWidth - hero.size && hero.top<height-hero.size){

    hero.moveRight();
  }
  else if(hero.top>height-hero.size)
  {
    hero.moveTopRight();
  }
  document.getElementById('game').innerHTML = hero.getHeroElement();
  setTimeout(start, 500)
}

start();