let count=0
let i=1
while(i<=100)
{
    if((i%3==0) && (i%6==0) && (i%9==0))
    {
        count=count+1;
    }
    i++;
}
console.log(count);
