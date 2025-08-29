let even=0
let odd=0
let a=1
do{
    if(a%2==0)
    {
        even+=1;
    }else
    {
        odd+=1;
    }
    a++;
}while(a<=500);
console.log("The Count of Even Number are:"+even);
console.log("The count of Odd Number are:"+odd);


