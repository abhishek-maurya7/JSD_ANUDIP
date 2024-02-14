// let a = "Hello World";
// console.log(a);
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//Array
// let names:string[] = ["a", "b", "c"]
// names.push(7); Gives an error as trying to add integer to string type arrray
// console.log(names);
//REadonly array
// let names1:readonly string[] = ["a", "b", "c"];
// console.log(names1)
//Typed Array
// let ourTuple:[Number, Boolean, String] = [1, true, "a"];
// ourTuple.push(2.1);
// console.log(ourTuple);
//named array
// const locations:[lat:number, long:number] = [44.1, 52.3];
// console.log(locations);
//objects
// let car:{type:string, model:number} = {type:"Toyota", model:5};
// console.log(car);
// let car:{type:string, model?:number} = {type:"Toyota"};
// console.log(car)
//Index signatures
// let a:{[index:string]:number} = {};
// a.Jack = 23;
// a.mark = 54;
// console.log(a); 
//enums
// enum statuscode {
//     accepted=201,
//     nofoound=400,
// }
// console.log(statuscode.accepted)
//interface
// interface rectangle {
//     //this is interface
//     height:number,
//     width:number
// }
// let rect:rectangle = {
//     //implementing interface rectangle
//     height:200,
//     width:800
// }
// console.log(rect);
// interface color extends rectangle {
//     //this interface extends rectangle interface
//     color:string
// }
// let object1:color = {
//     //implementing color interface
//     height:100,
//     width:200,
//     color:"red"
// }
// console.log(object1);
//functions
// function getNumber():number {
//     return 10;
// }
// console.log(getNumber());
//named param function
// function division({diviser, devident}:{diviser:number, devident:number}) {
//     return devident/diviser;
// }
// console.log(division({devident:30, diviser:10}));
////TypeSccript classes
// class Person {
//     // private name: string;
//     public constructor(private name:string) {
//         //this.name = name;  //no need to write this expliccitely since typescript does this by itself
//     }
//     getName():string {
//         return this.name;
//     }
// }
// const p1 = new Person("Abhishek");
// console.log(p1.getName());
//Interface and class
// interface shape {
//     getArea():number;
// }
// class Rectangle implements shape {
//     public constructor(private width:number, private height:number) {
//     }
//     getArea(): number {
//         return this.width * this.height;
//     }
// }
// const rect1 = new Rectangle(10, 20);
// console.log(rect1.getArea());
// class Square extends Rectangle {
//     public constructor(width:number) {
//         super(width, width);
//     }
//     //overriding inherited methods
//     public override getArea(): number {
//         return 500; 
//     }
// }
// const sq1 = new Square(10);
// console.log(`Are of the sqaure: ${sq1.getArea()}`);
var Animal = /** @class */ (function () {
    function Animal() {
    }
    return Animal;
}());
var Dog = /** @class */ (function (_super) {
    __extends(Dog, _super);
    function Dog() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Dog.prototype.sound = function () {
        return "Bhoo Bhoo";
    };
    return Dog;
}(Animal));
var doggo = new Dog();
console.log(doggo.sound());
