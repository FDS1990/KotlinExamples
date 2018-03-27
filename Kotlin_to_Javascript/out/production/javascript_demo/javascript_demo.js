if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'javascript_demo'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'javascript_demo'.");
}
var javascript_demo = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var throwCCE = Kotlin.throwCCE;
  var toInt = Kotlin.kotlin.text.toInt_pdl1vz$;
  function main(args) {
    println("se viene dichiarata questa funzione l'interprete l'eseguira al caricare della pagina");
  }
  function myFunction() {
    var tmp$, tmp$_0;
    var number_1 = Kotlin.isType(tmp$ = document.getElementById('number_1txt'), HTMLInputElement) ? tmp$ : throwCCE();
    var number_2 = Kotlin.isType(tmp$_0 = document.getElementById('number_2txt'), HTMLInputElement) ? tmp$_0 : throwCCE();
    var somma = toInt(number_1.value) + toInt(number_2.value) | 0;
    alert(somma);
  }
  _.main_kand9s$ = main;
  _.myFunction = myFunction;
  main([]);
  Kotlin.defineModule('javascript_demo', _);
  return _;
}(typeof javascript_demo === 'undefined' ? {} : javascript_demo, kotlin);
