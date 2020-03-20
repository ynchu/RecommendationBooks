# 上传Github

…or create a new repository on the command line

```bash
echo "# RecommendationBooks" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin git@github.com:ynchu/RecommendationBooks.git
git push -u origin master
```

…or push an existing repository from the command line

```bash
git remote add origin git@github.com:ynchu/RecommendationBooks.git
git push -u origin master
```

…or import code from another repository

```txt
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.
```
