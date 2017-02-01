module pri8to3(w,y,z);
input [7:0]w;
output [2:0]y;
output z;
integer k;

reg [2:0]y;
reg z;
always @ (w)
begin
z=0;
for(k=0;k<8;k=k+1)
if(w[k])
begin
y=k;
z=1;
end
end
endmodule
