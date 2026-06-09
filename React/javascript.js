//Variables
let a="Loga"
a="Varshhni"
const b=14
console.log(a);
console.log(b);

//Normal function
function add(a,b){
    console.log(a+b);
}
add(3,5);

//Arrow function
const addition = (a,b)=>{
    return a+b;
}
console.log(addition(4,5));

//Arrow function shorter form
const addition1 = (a,b)=>a+b;
console.log(addition1(5,5));

//one parameter
const sq = (a) =>a*a;
console.log(sq(5));

//template literal
let name="Logavarshhni"
console.log(`Welcome back ${name}!!`);

//Destructuring
//Array Destructuring
const arr=["Hi","Hello","Welcome"];
const [c,d,e]=arr;
console.log(c);

//Object Destructuring
const Student={
    name1:"Loga",
    age1:19
}
const {name1,age1}=Student;
console.log(age1);

//Spread operator
//array
const arr2=[1,2,3];
const res=[...arr2];//copy
console.log(arr2);
const final=[...arr2,...res];//merge
console.log(final)

//object
const obj={
    dept:"CSE",
    clg:"SECE"
}
const obj2={
    ...obj,
    city:"CBE"
}
console.log(obj);

//rest operator
const num=(...Num)=>{
    console.log(Num);
}
num(1,2,3,4,5,6,7,8,9,10);

//map
const f=[1,2,3,4,5,6,7]
const g=f.map((i)=>i*2)
console.log(g)

//filter
const h=f.filter((i)=>i%2==0)
console.log(h)

//for each loop
f.forEach((i)=>(console.log(i)));

//find
const a1=[1,2,3,4,5]
const a3=a1.find(i=>i>1)
console.log(a3)

//ternary operator
let age2=18;
console.log((age2>=18)?"Vote":"No");

