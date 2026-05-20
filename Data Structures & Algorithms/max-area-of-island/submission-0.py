class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0 
        island=0
        row=len(grid)
        col=len(grid[0])
        direction=[(1,0), (-1,0), (0,1), (0,-1)]
        best=0

        def dfs(r,c):
            if r<0 or c<0 or r>=row or c>=col or grid[r][c]==0:
                return 0
            
            grid[r][c]=0
            area=1

            for dr, dc in direction:
                area+=dfs(r+dr, c+dc)
            return area
            

        for r in range(row):
            for c in range(col):
                if grid[r][c]==1:
                    area=dfs(r,c)
                    best=max(best, area)
        return best

