module prg3(a,b,c,d,f);
input a,b,c,d;
output f;
assign f=(b|d)&(a|~c|~d)&(~a|b)&(~a|c|d);
endmodule
