let Ecount=0
let Ocount=0
for(let i=1;i<=500;i++)
{
    if(i%2==0)
    {
        Ecount=Ecount+1;
    }else{
        Ocount=Ocount+1;
    }
}
console.log("The count of Even Number is:"+Ecount);
console.log("The count of Odd Number is:"+Ocount);

