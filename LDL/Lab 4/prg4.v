module prg4(a,b,c,d,f);
input a,b,c,d;
output f;
assign f=((~c&~d)&(~a|~b))|((c|d)&(a&b));
endmodule
