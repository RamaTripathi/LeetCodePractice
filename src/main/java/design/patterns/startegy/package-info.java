/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.startegy;

//In Strategy pattern, a class behavior or its algorithm can be changed at run time.
// This type of design pattern comes under behavior pattern.
//In Strategy pattern, we create objects which represent various strategies
// and a context object whose behavior varies as per its strategy object.
// The strategy object changes the executing algorithm of the context object.
//We are going to create a Strategy interface defining an action and
// concrete strategy classes implementing the Strategy interface. Context is a class which uses a Strategy.