let ENum=0
let ONum=0
let num=1
while(num<=500)
{
    if(num%2==0){
        ENum=ENum+1;
    }
    else{
        ONum=ONum+1;
    }
    num++;
}
console.log("The count of Even Number are:"+ENum);
console.log("The count of Odd Number are:"+ONum);

