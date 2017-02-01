module prg3(a,b,c,d,g,h);
input a,b,c,d;
output g,h;
assign g= (~a&~c&~d)|(~b&c&~d)|(a&~b&~c&d)|(~a&b&c);
assign h= (~a&~c&~d)|(~b&c&~d)|(a&~b&~c&d)|(a&b&d);
endmodule

