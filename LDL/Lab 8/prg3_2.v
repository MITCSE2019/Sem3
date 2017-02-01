module prg3_2(b,f);
input [2:0]b;
output f;
wire [3:0]m;
assign m[0]=1;
assign m[1]=0;
assign m[2]=~b[0];
assign m[3]=b[0];
mux4to1 stage(m,b[2:1],f);
endmodule

module mux4to1(w,s,f);
input [3:0]w;
input [1:0]s;
output f;
reg f;
always @(w or s)
f=s[1]?((s[0]?w[3]:w[2])):((s[0]?w[1]:w[0]));
endmodule
