module prg3(a,f1,f2);
input a;
output f1,f2;
assign f1 = ~(~a);
assign f2 = a;
endmodule
