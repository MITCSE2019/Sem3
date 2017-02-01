module mux4to1__1(w,s,f);
input [3:0]w;
input [1:0]s;
output f;
reg f;
always @(s or w)
begin
if(s[1])

	begin
	if(s[0])
	f=w[3];
	else
	f=w[2];
	end

else

	begin
	if(s[0])
	f=w[1];
	else
	f=w[0];
	end
end

endmodule

