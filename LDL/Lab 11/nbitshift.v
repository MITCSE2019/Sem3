module nbitshift(D,Q,clk);
parameter n=4;
input D;
input clk;
output [n-1:0]Q;
reg [n-1:0]Q;
integer i;
always @(posedge clk)
begin 
Q[n-1]<=D;
for(i=n-2;i>=0;i=i-1)
Q[i]<=Q[i+1];
end
endmodule
