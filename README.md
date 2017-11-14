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
    > A builder for a component. Components may have a single nested static abstract class or interface annotated with @Component.Builder. If they do, then the component's generated builder will match the API in the type.
- 规则（Builders rules）
    - 必须存在一个没有参数的抽象方法，返回值必须是组件类型。（这个方法通常称为`build()`方法）
    - 其他所有的抽象方法必须采用单个参数并且返回类型必须是 void 或者 Builder类型 或者 Builder的超类型
- 案例

    ```java
    @Component(modules = {BackendModule.class, FrontendModule.class})
         interface MyComponent {
           MyWidget myWidget();

            @Component.Builder
           interface Builder {
             //一个没有参数的`build()`方法，返回MyComponent类型
             MyComponent build();
             Builder backendModule(BackendModule bm);
             Builder frontendModule(FrontendModule fm);
           }
         }
    ```