let count=0
for(let i=1;i<=100;i++)
{
    if((i%3==0) && (i%6==0) && (i%9==0))
    {
        count=count+1;
    }
}
console.log("The count of numbers which are divisible by 3,6 abd 9 are:"+count);
