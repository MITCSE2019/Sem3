module example2(x1,x2,x3,x4,f);
input x1,x2,x3,x4;
output f;
and(a,x1,x2);
and(b,x3,x4);
not(c,x2);
or(d,c,x1);
not(e,x3);
or(k,e,x4);
or(g,a,b);
and(h,d,k);
or(f,g,h);
endmodule
