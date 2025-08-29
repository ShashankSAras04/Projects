let count=0
let i=1
do{
    if((i%3==0) && (i%6==0) && (i%9==0))
    {
        count=count+1;
    }
    i++;
}while(i<=100);
console.log(count);
