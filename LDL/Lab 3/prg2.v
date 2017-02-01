module prg2(a,b,c,d,f);
input a,b,c,d;
output f;
assign f = (c&~d)|(~a&~d)|(~b&~d)|(a&b&~c&d);
endmodule
