

## ButterKnife

### ButterKnife onclick点击事件没反应问题
    在添加依赖的时需要添加两个，如果点击没反应，可能是少了下面那一句。
    compile 'com.jakewharton:butterknife:x.x.x'
    annotationProcessor 'com.jakewharton:butterknife-compiler:x.x.x'
