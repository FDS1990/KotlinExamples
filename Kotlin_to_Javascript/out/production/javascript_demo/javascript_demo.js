if (typeof kotlin === 'undefined')
{
  throw new Error("Error loading module 'javascript_demo'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'javascript_demo'.");
}

var javascript_demo = function (_, Kotlin)
{
  'use strict';
  function main() {
    alert('Esempio codice Kotlin tradotto in Javascript');
  }
  _.main = main;
  Kotlin.defineModule('javascript_demo', _);
  return _;
}(typeof javascript_demo === 'undefined' ? {} : javascript_demo, kotlin);
