module example4(x1,x2,x3,f);
input x1,x2,x3;
output f;
not(a,x1);                       
not(b,x2);
not(c,x3);
or(u,x1,x2,x3);
or(v,a,x2,x3);
or(w,x1,b,x3);
or(x,x1,x2,c);
and(f,u,v,w,x);


endmodule
