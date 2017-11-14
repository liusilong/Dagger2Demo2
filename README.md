# Dagger2Demo2
### demo1
- dagger2基本用法
### demo2
- 一个Component依赖多个Module
### demo3(Dependencies)
- Component之间的依赖，子Component依赖父Component
- 注意：当两个组件是依赖关系的时候，子组件只能使用父组件暴露出来的对象
### demo4(SubComponent)
- 使用SubComponent来关联父子组件
- 注意：当两个组件使用SubComponent关联时，子组件可以访问父组件中的一切对象（不需要父组件显示暴露）
### demo5(Annotation Type Component.Builder)
    - 定义
    - 案例
    @Component(modules = {BackendModule.class, FrontendModule.class})
     interface MyComponent {
       MyWidget myWidget();

        @Component.Builder
       interface Builder {
         MyComponent build();
         Builder backendModule(BackendModule bm);
         Builder frontendModule(FrontendModule fm);
       }
     }