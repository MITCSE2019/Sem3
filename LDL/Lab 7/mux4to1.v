module mux4to1(w,s,f);
input [3:0]w;
input [1:0]s;
output f;
reg f;
always @(w or s)
f=s[1]?((s[0]?w[3]:w[2])):((s[0]?w[1]:w[0]));
endmodule

